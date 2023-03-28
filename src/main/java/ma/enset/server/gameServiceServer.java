package ma.enset.server;

import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Game;
import ma.enset.stubs.gameServiceGrpc;
import java.util.HashMap;
import java.util.Map;

public class gameServiceServer extends gameServiceGrpc.gameServiceImplBase{
    public int magicNumber=6;
    Map<String ,StreamObserver<Game.messageResponse>> userList=new HashMap<>();
    @Override
    public void login(Game.connect request, StreamObserver<Game.messageResponse> responseObserver) {
        System.out.println("player "+request.getUserName()+" is joining");
        String userName=request.getUserName();
        userList.put(userName,responseObserver);
        Game.messageResponse response = Game.messageResponse.newBuilder()
                .setFrom("server")
                .setMessage("Hello "+userName+" welcome to GUESS-GAME")
                .build();
        responseObserver.onNext(response);
    }

    @Override
    public void guess(Game.messageRequest request, StreamObserver<Game.messageResponse> responseObserver) {
        String from=request.getFrom();
        String number=request.getNumber();
        if(Integer.parseInt(number)<magicNumber){
            Game.messageResponse response = Game.messageResponse.newBuilder()
                    .setFrom("server")
                    .setMessage("essayer un nombre plus grand")
                    .build();
            userList.get(from).onNext(response);
        } else if (Integer.parseInt(number)>magicNumber) {
            Game.messageResponse response = Game.messageResponse.newBuilder()
                    .setFrom("server")
                    .setMessage("essayer un nombre plus petit")
                    .build();
            userList.get(from).onNext(response);
        }else {
            Game.messageResponse response = Game.messageResponse.newBuilder()
                    .setFrom(from)
                    .setMessage("Congrats you win !!")
                    .build();
            userList.get(from).onNext(response);

            Game.messageResponse broadcast = Game.messageResponse.newBuilder()
                    .setFrom(from)
                    .setMessage("The player "+from+" won the game")
                    .build();
            for (String name : userList.keySet()) {
                if(!name.equals(from)){
                    userList.get(name).onNext(broadcast);
                }
            }
        }

    }
}

