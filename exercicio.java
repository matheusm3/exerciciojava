package primeiro_exercicio;
import java.util.Scanner;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar; 

public class exercicio {
	public static void main(String[] args) {
        // atribuindo a leitura à "ler"
        Scanner ler = new Scanner(System.in);
        
        //arrays
        String[] dados = new String[4];
        String[] p308 = {"Motor: 173 HP", "Azul", "2012", "R$ 60 / DIA", "Peugeot 308"};
        String[] p208 = {"Motor: 1,2 / 3 cilindros em linha", "Branco", "2014", "R$ 58 / DIA", "Peugeot 208"};
        String[] vitara = {"Motor: 1,4 / 4 cilindros em linha", "Cinza", "2018", "R$ 60 / DIA", "Vitara"};
        String[] s_cross = {"Motor: 1,4 / 4 cilindros em linha", "Chumbo", "2017", "R$ 70 / DIA", "S-Cross"};
        String[] argo = {"Motor: 77 - 139 HP", "Branco", "2018", "R$ 50 / DIA", "Argo"};
        String[] freemont = {"Motor: 2.4 16V (172cv)", "Preto", "2013", "R$ 57 / DIA", "Freemont"};
        String[] cruze = {"Motor: 153 HP", "Chumbo", "2017", "R$ 57 / DIA", "Cruze"};
        String[] onix = {"Motor: 78 HP", "Azul cobalto", "2018", "R$ 55 / DIA", "Onix"};
        
        String datastring = formaData();
        
        System.out.println(datastring);
        
        // ROTINA 1
        
		// inputs
        System.out.println("Informe seu primeiro nome");
        // lê o resultado
        dados[0] = ler.next();
        
        System.out.println("informe seu endereço de e-mail");
        dados[1] = ler.next();
        
        dados[2] = datastring;
        
        dados[3] = "Solicitação de locação! "
        		+ "Modelo desejado: ";
        
        // ROTINA 2
        int opcao = 0;
        // Menu 1
        do {
	        System.out.println("_________________________");
        	System.out.println("Informe o número da marca desejada!");
	        System.out.println("1. Peugeot;");
	        System.out.println("2. Suzuki;");
	        System.out.println("3. Fiat");
	        System.out.println("4. Chevrolet");
	        System.out.println("5. Sair");
	        // leitura da opção escolhida
            opcao = ler.nextInt();
            
            switch(opcao) {
            // primeira escolha
            case 1:
            	int modelopeugeot = 0;
    	        System.out.println("Selecione o modelo:");
    	        System.out.println("1. 308;");
    	        System.out.println("2. 208;");
    	        // leitura de modelo escolhido
    	        modelopeugeot = ler.nextInt();
    	       
    	        switch(modelopeugeot) {
    	        // laço mostrando o conteúdo do array com as informações do modelo
    	        case 1:
    	        	for (int i = 0; i < 4; i++) {  
	        			System.out.println(p308[i]);
    	        	}
    	        	int opcaoemail = 0;
        	        System.out.println(" ");
        	        System.out.println("Como deseja prosseguir?");
    	        	System.out.println("1. Mandar solicitação;");
        	        System.out.println("2. Sair");
        	        // leitura da opção escolhida
        	        opcaoemail = ler.nextInt();
        	        
        	        switch (opcaoemail) {
        	        case 1:
        	        	// encaminhamento à função responsável pelo envio de e-mails,
        	        	// com parâmetros referentes ao usuário e ao carro
        	        	mandarEmail(dados, p308);
        	        case 2:
        	        	opcao = 4;
        	        }
    	        case 2:
        	        // laço mostrando o conteúdo do array com as informações do modelo
    	        	for (int i = 0; i < 4; i++) {  
	        			System.out.println(p208[i]);
    	        	}
    	        	opcaoemail = 0;
        	        System.out.println(" ");
        	        System.out.println("Como deseja prosseguir?");
    	        	System.out.println("1. Mandar solicitação;");
        	        System.out.println("2. Sair");
        	        // opção escolhida
        	        opcaoemail = ler.nextInt();
        	        
        	        switch (opcaoemail) {
        	        case 1:
        	        	// encaminhamento à função responsável pelo envio de e-mails,
        	        	// com parâmetros referentes ao usuário e ao carro
        	        	mandarEmail(dados, p208);
        	        case 2:
        	        	opcao = 4;
        	        }
    	        }
    	    // segunda escolha
            case 2:
            	int modelosuzuki = 0;
    	        System.out.println("Selecione o modelo:");
    	        System.out.println("1. Vitara;");
    	        System.out.println("2. S-Cross;");
    	        // leitura do modelo escolhido
    	        modelosuzuki = ler.nextInt();
    	        
    	        switch (modelosuzuki){
    	        case 1:
        	        // laço mostrando o conteúdo do array com as informações do modelo
    	        	for (int i = 0; i < 4; i++) {  
	        			System.out.println(vitara[i]);
    	        	}
    	        	int opcaoemail = 0;
        	        System.out.println(" ");
        	        System.out.println("Como deseja prosseguir?");
    	        	System.out.println("1. Mandar solicitação;");
        	        System.out.println("2. Sair");
        	        // leitura da opção escolhida
        	        opcaoemail = ler.nextInt();
        	        
        	        switch (opcaoemail) {
        	        case 1:
        	        	// encaminhamento à função responsável pelo envio de e-mails,
        	        	// com parâmetros referentes ao usuário e ao carro
        	        	mandarEmail(dados, vitara);
        	        case 2:
        	        	opcao = 4;
        	        }
    	        case 2:
        	        // laço mostrando o conteúdo do array com as informações do modelo
    	        	for (int i = 0; i < 4; i++) {  
	        			System.out.println(s_cross[i]);
    	        	}
    	        	opcaoemail = 0;
        	        System.out.println(" ");
        	        System.out.println("Como deseja prosseguir?");
    	        	System.out.println("1. Mandar solicitação;");
        	        System.out.println("2. Sair");
        	        // leitura de opção escolhida
        	        opcaoemail = ler.nextInt();
        	        
        	        switch (opcaoemail) {
        	        case 1:
        	        	// encaminhamento à função responsável pelo envio de e-mails,
        	        	// com parâmetros referentes ao usuário e ao carro
        	        	mandarEmail(dados, s_cross);
        	        case 2:
        	        	opcao = 4;
        	        }
    	        }
    	    // terceira escolha
            case 3:
            	int modelofiat = 0;
    	        System.out.println("Selecione o modelo:");
    	        System.out.println("1. Argo;");
    	        System.out.println("2. Freemont;");
            	
    	        modelofiat = ler.nextInt();
    	        
    	        switch (modelofiat) {
    	        case 1:
    	        	for (int i = 0; i < 4; i++) {  
	        			System.out.println(argo[i]);
    	        	}
    	        	int opcaoemail = 0;
        	        System.out.println(" ");
        	        System.out.println("Como deseja prosseguir?");
    	        	System.out.println("1. Mandar solicitação;");
        	        System.out.println("2. Sair");
        	        // leitura do modelo escolhido
        	        opcaoemail = ler.nextInt();
        	        
        	        switch (opcaoemail) {
        	        case 1:
        	        	// encaminhamento à função responsável pelo envio de e-mails,
        	        	// com parâmetros referentes ao usuário e ao carro
        	        	mandarEmail(dados, argo);
        	        case 2:
        	        	opcao = 4;
        	        }
    	        case 2:
    	        	for (int i = 0; i < 4; i++) {  
	        			System.out.println(freemont[i]);
    	        	}
    	        	opcaoemail = 0;
        	        System.out.println(" ");
        	        System.out.println("Como deseja prosseguir?");
    	        	System.out.println("1. Mandar solicitação;");
        	        System.out.println("2. Sair");
        	        // leitura da opção escolhida
        	        opcaoemail = ler.nextInt();
        	        
        	        switch (opcaoemail) {
        	        case 1:
        	        	// encaminhamento à função responsável pelo envio de e-mails,
        	        	// com parâmetros referentes ao usuário e ao carro
        	        	mandarEmail(dados, freemont);
        	        case 2:
        	        	opcao = 4;
        	        }
    	        }
    	    // quarta escolha    
            case 4:
            	int modelochevrolet = 0;
    	        System.out.println("Selecione o modelo:");
    	        System.out.println("1. Cruze;");
    	        System.out.println("2. Onix;");
            	
    	        modelochevrolet = ler.nextInt();
    	        
    	        switch (modelochevrolet) {
    	        case 1:
    	        	for (int i = 0; i < 4; i++) {  
	        			System.out.println(cruze[i]);
    	        	}
    	        	int opcaoemail = 0;
        	        System.out.println(" ");
        	        System.out.println("Como deseja prosseguir?");
    	        	System.out.println("1. Mandar solicitação;");
        	        System.out.println("2. Sair");
        	        
        	        opcaoemail = ler.nextInt();
        	        
        	        switch (opcaoemail) {
        	        case 1:
        	        	mandarEmail(dados, cruze);
        	        case 2:
        	        	opcao = 4;
        	        }
    	        case 2:
    	        	for (int i = 0; i < 4; i++) {  
	        			System.out.println(onix[i]);
    	        	}
    	        	opcaoemail = 0;
        	        System.out.println(" ");
        	        System.out.println("Como deseja prosseguir?");
    	        	System.out.println("1. Mandar solicitação;");
        	        System.out.println("2. Sair");
        	        
        	        opcaoemail = ler.nextInt();
        	        
        	        switch (opcaoemail) {
        	        case 1:
        	        	mandarEmail(dados, onix);
        	        case 2:
        	        	opcao = 4;
        	        }
    	        }
            
            }
        } while (opcao != 5);
	}
    
    public static void mandarEmail ( String[] dados, String[] modelo ) {
    	// função responsável pelo e-mail fictício.
    	System.out.println("-------- SOLICITAÇÃO -------");
    	System.out.println("E-MAIL PARA: LOCADORA DE CARROS");
    	System.out.println("De: " + dados[0]);
    	System.out.println("Responder para: " + dados[1]);    	
    	System.out.println("Mensagem: De acordo com o sistema, o modelo escolhido foi:" + modelo[4]);
       	System.out.println("Data da Consulta: " + dados[2]);
       	System.out.println(" ");
       	System.out.println("E-Mail enviado!");
    }
        
	private static String formaData() {
		// importa a data atual
        Date data = Calendar.getInstance().getTime();  
        // formata a data atual
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        // transforma em String para que possa compor o array
        String datastring = dateFormat.format(data);
		return datastring;
	}
}