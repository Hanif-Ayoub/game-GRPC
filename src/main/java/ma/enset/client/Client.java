package ma.enset.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Game;
import ma.enset.stubs.gameServiceGrpc;

import java.io.IOException;
import java.util.Scanner;

public class Client {
    static gameServiceGrpc.gameServiceStub asyStub;
    static String userName;

    public static void login(){
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",1111)
                .usePlaintext()
                .build();
        asyStub= gameServiceGrpc.newStub(managedChannel);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name : ");
        userName=myObj.nextLine();
        Game.connect requestLogin= Game.connect.newBuilder()
                .setUserName(userName)
                .build();
        asyStub.login(requestLogin, new StreamObserver<Game.messageResponse>() {

            @Override
            public void onNext(Game.messageResponse messageResponse) {
                System.out.println();
                System.out.println(messageResponse.getMessage());
                System.out.println();
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onCompleted() {
            }
        });
    }

    public static void guess(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter a number");
        while (true){
            String number=myObj.nextLine();
            Game.messageRequest request= Game.messageRequest.newBuilder()
                    .setFrom(userName)
                    .setNumber(number)
                    .build();
                asyStub.guess(request, new StreamObserver<Game.messageResponse>() {
                    @Override
                    public void onNext(Game.messageResponse messageResponse) {
                    }
                    @Override
                    public void onError(Throwable throwable) {
                    }
                    @Override
                    public void onCompleted() {
                    }
                });
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        login();
        Thread.sleep(2500);
        guess();
        System.in.read();
    }
}