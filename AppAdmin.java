package fr.voxi.admin;
import java.time.LocalDate ;

public class AppAdmin {
	public static void main(String[] args) {
		Abonnement Abn1 = new Abonnement (201, LocalDate.of(2024, 01, 03));
		System.out.println(Abn1.toString());
		Abonnement Abn2 = new Abonnement (202, LocalDate.of(2024, 01, 10));
		System.out.println(Abn2.toString());
		System.out.println("la durée de l'abonnement est de " + Abonnement.getDureeAbn()+ " mois");
		Abonnement.setDureeAbn(5);
		System.out.println("la durée de l'abonnement est de " + Abonnement.getDureeAbn()+ " mois");
		Abn1.setDureeAbn(7);
		System.out.println("la durée de l'abonnement 201 est de " + Abn1.getDureeAbn()+ " mois");
		System.out.println("la durée de l'abonnement 202 est de " + Abn2.getDureeAbn()+ " mois");
		System.out.println("la durée de l'abonnement est de " + Abonnement.getDureeAbn()+ " mois");
	}
}
