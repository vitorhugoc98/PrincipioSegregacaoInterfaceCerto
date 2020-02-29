package principiosegregacaointerfacecerto;

public class PrincipioSegregacaoInterfaceCerto {

    public static void main(String[] args) {

        ClientePessoaFisica pessoaf01 = new ClientePessoaFisica("Lucas Fernandes", "708.652.531-61");
        ClientePessoaJuridica pessoaj01 = new ClientePessoaJuridica("Time Share Soluções LTDA", "19.819.955/0001-01");

        System.out.println("PF Nome: " + pessoaf01.getNome());
        System.out.println("PF CPF: " + pessoaf01.getCpf());

        System.out.println("PJ razão Social: " + pessoaj01.getRazaoSocial());
        System.out.println("PJ CNPJ: " + pessoaj01.getCnpj());
    }

}
