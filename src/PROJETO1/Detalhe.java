package PROJETO1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Detalhe {
    File arq = new File("C:/Users/barbo/Desktop/ProjetoJava");
    File[] listOfFiles = arq.listFiles();
    VerificadorCharact verif = new VerificadorCharact();

    public void detalhe2() {
        try{
            tipHeg2();
            modPlas();
            kitMOD();
            seqCART();
            linha1();
            linha2();
            linha3();
            linha4();
            linhaVerso();
            trilha1();
            trilha2();

        }catch (IOException e){
            System.out.println("error"+ e.getMessage());
        }
    }
    public void tipHeg2() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String abc2 = list1[2].toString().substring(0,1);
            for (int i = 0; i < abc2.length(); i++) {
                if (abc2.equals("2")) {
                    System.out.println("Tipo do registro válido do arquivo " + abc.getName() + "ok");
                } else {
                    System.out.println("Erro no tipo de registro " + abc.getName());
                }
            }
        }
    }
    public void modPlas() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(1, 4);
            if (verif.isInteger(a)) {
                System.out.println("mod plast Válido");
            } else {
                System.out.println("mod plast Inválido do arquivo " + abc.getName());
            }
        }
    }

    public void kitMOD() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(4, 10);
            if (verif.isAlfa(a)) {
                System.out.println("mod do kit Válido");
            } else {
                System.out.println("mod do kit do arquivo " + abc.getName() + " inválido");
            }
        }
    }

    public void seqCART() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(10, 16);
            if (verif.isInteger(a)) {
                System.out.println("seq-cart válido");
            } else {
                System.out.println("seq-cart do arquivo " + abc.getName() + " inválido");
            }
        }
    }
    public void linha1() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(16, 56);
            if (verif.isAlfa(a)) {
                System.out.println("linha-01 válido");
            } else {
                System.out.println("linha-01 do arquivo " + abc.getName() + " inválido");
            }
        }
    }
    public void linha2() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(56, 96);
            if (verif.isAlfa(a)) {
                System.out.println("linha-02 válido");
            } else {
                System.out.println("linha-02 do arquivo " + abc.getName() + " inválido");
            }
        }
    }
    public void linha3() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(96, 136);
            if (verif.isAlfa(a)) {
                System.out.println("linha-03 válido");
            } else {
                System.out.println("linha-03 do arquivo " + abc.getName() + " inválido");
            }
        }
    }
    public void linha4() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(136, 176);
            if (verif.isAlfa(a)) {
                System.out.println("linha-04 válido");
            } else {
                System.out.println("linha-04 do arquivo " + abc.getName() + " inválido");
            }
        }
    }
    public void linhaVerso() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(176, 216);
            if (verif.isAlfa(a)) {
                System.out.println("linha-verso válido");
            } else {
                System.out.println("linha-verso do arquivo " + abc.getName() + " inválido");
            }
        }
    }
    public void trilha1() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(216, 294);
            if (verif.isAlfa(a)) {
                System.out.println("trilha-01 válido");
            } else {
                System.out.println("trilha-01 do arquivo " + abc.getName() + " inválido");
            }
        }
    }
    public void trilha2() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(294, 333);
            if (verif.isAlfa(a)) {
                System.out.println("trilha-02 válido");
            } else {
                System.out.println("trilha-02 do arquivo " + abc.getName() + " inválido");
            }
        }
    }
    public void trilha3() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(333, 440);
            if (verif.isAlfa(a)) {
                System.out.println("trilha-03 válido");
            } else {
                System.out.println("trilha-03 do arquivo " + abc.getName() + " inválido");
            }
        }
    }
    public void qntCar() throws IOException {
        for (File abc : listOfFiles) {
            Stream<String> str = Files.lines(abc.toPath());
            Object[] list1 = str.toArray();
            String a = list1[2].toString().substring(333, 440);
            if (verif.isAlfa(a)) {
                System.out.println("trilha-03 válido");
            } else {
                System.out.println("trilha-03 do arquivo " + abc.getName() + " inválido");
            }
        }
    }
}

