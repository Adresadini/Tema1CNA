import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.ClientOuterClass;
import proto.tema1ServiceGrpc;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();
        tema1ServiceGrpc.tema1ServiceStub stub = tema1ServiceGrpc.newStub(channel);
        boolean isConnected = true;
        System.out.println("Buna ziua, va rugam sa introduceti numele");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String nume = sc.next();
        String CNP;
        do {
            System.out.println("Va rugam introduceti CNP-ul");
            CNP = sc.next();
        } while (CNP.length() < 3 || (CNP.charAt(0) != '1' && CNP.charAt(0) != '2' && CNP.charAt(0) != '5' && CNP.charAt(0) != '6')
                || !Character.isDigit(CNP.charAt(1)) || !Character.isDigit(CNP.charAt(2)));
        stub.getInfo(ClientOuterClass.Client.newBuilder().setNume(nume).setCNP(CNP).build(), new StreamObserver<ClientOuterClass.ClientResponse>() {
            @Override
            public void onNext(ClientOuterClass.ClientResponse clientResponse) {
                System.out.println("Nume: " + clientResponse.getNume());
                System.out.println("Varsta:" + clientResponse.getVarsta());
                System.out.println("Gen:" + clientResponse.getGen().name());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {

            }
        });

        while (isConnected) {
        }
        channel.shutdown();
    }
}
