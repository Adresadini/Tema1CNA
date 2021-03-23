package Services;

import io.grpc.stub.StreamObserver;
import proto.ClientOuterClass;
import proto.tema1ServiceGrpc;
import sun.misc.ObjectInputFilter;

public class Client extends tema1ServiceGrpc.tema1ServiceImplBase {
    @Override
    public void getInfo(ClientOuterClass.Client request, StreamObserver<ClientOuterClass.ClientResponse> responseObserver) {
        ClientOuterClass.ClientResponse.Builder response = ClientOuterClass.ClientResponse.newBuilder();
        System.out.println("Nume:"+request.getNume());
        System.out.println("CNP: "+request.getCNP());
        response.setNume(request.getNume());
        char gen = request.getCNP().charAt(0);
        String anulNasterii = request.getCNP().substring(1,3);
        if (gen < '3') {
            if (gen == '1')
                response.setGen(ClientOuterClass.Gen.MASCULIN);
            else if (gen == '2')
                response.setGen(ClientOuterClass.Gen.FEMININ);
            response.setVarsta(121 - Integer.parseInt(anulNasterii));
        }
        else {
            if (gen == '5')
                response.setGen(ClientOuterClass.Gen.MASCULIN);
            else if (gen == '6')
                response.setGen(ClientOuterClass.Gen.FEMININ);
            response.setVarsta(21 - Integer.parseInt(anulNasterii));
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

}
