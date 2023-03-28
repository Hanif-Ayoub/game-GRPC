package ma.enset.server;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server= ServerBuilder.forPort(1111)
                .addService(new gameServiceServer())
                .build();
        server.start();
        System.out.println("The magic number is "+new gameServiceServer().magicNumber);
        server.awaitTermination();
    }
}
