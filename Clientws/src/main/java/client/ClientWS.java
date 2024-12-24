package client;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        System.out.println(proxy.conversion(600));
        Compte cp = proxy.getCompte(4);
        System.out.println("------------------------------");
        System.out.println(cp.getSolde());
        System.out.println(cp.getCode());
    }
}
