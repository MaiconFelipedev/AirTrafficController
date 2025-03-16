package mediator;

public class MainMediator {

	public static void main(String[] args) {
        ATCMediator atcMediator = new ATC();
        
        //Componente 1
        Flight f1 = new Flight(atcMediator, "LATAM", "LA4542");
        Flight f2 = new Flight(atcMediator, "GOL","GL1273");
        
        //Componente 2
        Runway mainRunway = new Runway(atcMediator);
        
        atcMediator.registerFlight(f1);        
        atcMediator.registerFlight(f2);

        atcMediator.registerRunway(mainRunway);
        
        System.out.println(">> Contato da aeronave 1....");
        f1.getReady();
        System.out.println();
        
        System.out.println(">> Consultando situacao da pista....");
        mainRunway.land();
        System.out.println();

        System.out.println(">> Contato da aeronave 2....");
        f2.getReady();
        System.out.println();
        
        System.out.println(">> Consultando situacao da pista....");
        mainRunway.land();
        System.out.println();

        f1.land();
        System.out.println();

        System.out.println(">> Consultando situacao da pista....");
        mainRunway.land();
        System.out.println();

        f2.land();
	}

}

/*
>> Contato da aeronave 1....
Voo LA4542 da LATAM solicitando autorizacao para pouso...

>> Consultando situacao da pista....
Landing permission granted.

>> Contato da aeronave 2....
Voo GL1273 da GOL solicitando autorizacao para pouso...

>> Consultando situacao da pista....
Runway is busy. Wait for permission.

Flight LA4542 Successfully Landed.

>> Consultando situacao da pista....
Landing permission granted.

Flight GL1273 Successfully Landed.

## TRADUCAO
>> Contato da comunicação 1....
Voo LA4542 da LATAM solicitando autorização para pouso...

>> Consultando situação da pista....
Permissão de pouso concedida.

>> Contato da comunicação 2....
Voo GL1273 da GOL solicitando autorização para pouso...

>> Consultando situação da pista....
A pista está ocupada. Aguarde permissão.

Voo LA4542 pousou com sucesso.

>> Consultando situação da pista....
Permissão de pouso concedida.

Voo GL1273 pousou com sucesso.
 */