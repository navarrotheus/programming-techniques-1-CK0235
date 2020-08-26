import java.util.*;

class Brasil {
  public static void main(String args[]) {
    Map<String, String> siglas = new HashMap<String, String>();

    siglas.put("AC", "Acre");
    siglas.put("AL", "Alagoas");
    siglas.put("AP", "Amapá");
    siglas.put("AM", "Amazonas");
    siglas.put("BA", "Bahia");
    siglas.put("CE", "Ceará");
    siglas.put("ES", "Espirito Santo");
    siglas.put("GO", "Goiás");
    siglas.put("MA", "Maranhão");
    siglas.put("MT", "Mato Grosso");
    siglas.put("MS", "Mato Grosso do Sul");
    siglas.put("MG", "Minas Gerais");
    siglas.put("PA", "Pará");
    siglas.put("PB", "Paraíba");
    siglas.put("PR", "Paraná");
    siglas.put("PE", "Pernambuco");
    siglas.put("PI", "Piauí");
    siglas.put("RJ", "Rio de Janeiro");
    siglas.put("RN", "Rio Grande do Norte");
    siglas.put("RS", "Rio Grande do Sul");
    siglas.put("RO", "Rondônia");
    siglas.put("RR", "Roraima");
    siglas.put("SC", "Santa Catarina");
    siglas.put("SP", "São Paulo");
    siglas.put("SE", "Sergipe");
    siglas.put("TO", "Tocantins");
    siglas.put("DF", "Distrito Federal");

    System.out.println(args[0] + " -> " + siglas.get(args[0]));
  }
}