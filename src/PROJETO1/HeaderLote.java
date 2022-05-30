package PROJETO1;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;



public class HeaderLote {
    File arq = new File("C:/Users/barbo/Desktop/ProjetoJava");

    File[] listOfFiles = arq.listFiles();

    VerificadorCharact verif = new VerificadorCharact();


    public void Header1() {

        try {
            for (File abc : listOfFiles) {
                if(abc.exists()) {
                    String array[] = abc.getName().split("\\.");
                    if(array[1].equals("txt")){


                    Stream<String> str = Files.lines(abc.toPath());
                    Object[] list1 = str.toArray();
                        if(abc.length() > 0) {

                            tipHeg1(list1, abc);
                            modPlast(list1, abc);
                            numerodoKIT(list1, abc);
                            seqLOT(list1, abc);
                            tipProce(list1, abc);
                            tipMov(list1, abc);
                            tipCart(list1, abc);
                            tipGrav(list1, abc);
                            cordeEnt(list1, abc);
                            tipEnv(list1, abc);
                            tipEnd(list1, abc);
                            etiqBlo(list1, abc);
                            overlay(list1, abc);
                            postagem(list1, abc);
                            restLinha2(list1, abc);
                        }else{
                           // System.out.println("O ARQUIVO "+abc.getName()+ " ESTÁ VÁZIO");

                        }
                    }else{
                       // System.out.println("O ARQUIVO "+abc.getName()+ " NÃO PODE SER LIDO.");
                    }
                }else{
                    System.out.println("PASTA VAZIA");
                }
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    public void tipHeg1(Object[] list1, File abc) throws IOException {
                String xx = list1[1].toString().substring(0, 1);
                for (int i = 0; i < xx.length(); i++) {
                    if (xx.equals("1")) {
                         // System.out.println("TIPO DO REGISTRO DO ARQUIVO "+ abc.getName()+ " VÁLIDO");
                    } else {
                        System.out.println("ERRO NO TIPO DO REGISTRO DO HEADER LOTE NO ARQUIVO '" + abc.getName()+ "' INVÁLIDO. TIPO DO REGISTRO DIFERENTE DE '1'");
                    }
                }
        }
    public void modPlast(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(1, 4);
            if (verif.isInteger(a)) {
              //  System.out.println("MODELO DO ARQUIVO "+abc.getName()+ " VÁLIDO");
            } else {
                System.out.println("MODELO DO ARQUIVO "+abc.getName()+ " INVÁLIDO");
            }
        }
    public void numerodoKIT(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(4, 10);
            if (verif.isInteger(a)) {
              //  System.out.println("NUMERO DO KIT DO ARQUIVO "+abc.getName()+" VÁLIDO");
            } else {
                System.out.println("NUMERO DO KIT DO ARQUIVO "+abc.getName()+" INVÁLIDO");
            }
        }

    public void seqLOT(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(10, 14);
            if (verif.isInteger(a)) {
             //   System.out.println("SEQ DO LOT DO ARQUIVO "+abc.getName()+" VÁLIDO");
            } else {
                System.out.println("SEQ DO LOT DO ARQUIVO "+abc.getName()+" INVÁLIDO");
            }
        }

    public void tipProce(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(34, 36);
            if (verif.isInteger(a)) {
             //   System.out.println("TIPO DE PROCESSAMENTO DO ARQUIVO "+abc.getName()+" VÁLIDO");
            } else {
                System.out.println("TIPO DE PROCESSAMENTO DO ARQUIVO "+abc.getName()+" INVÁLIDO");
            }

        }

    public void tipMov(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(36, 38);
            if (verif.isInteger(a)) {
              //  System.out.println("TIPO DO ARQ. DO ARQUIVO "+abc.getName()+" VÁLIDO");
            } else {
                System.out.println("TIPO DO ARQ. DO ARQUIVO "+abc.getName()+" INVÁLIDO");
            }

        }

    public void tipCart(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(38, 40);
            if (verif.isInteger(a)) {
             //   System.out.println("TIPO DO CARTÃO DO ARQUIVO "+abc.getName()+" VÁLIDO");
            } else {
                System.out.println("TIPO DO CARTÃO DO ARQUIVO "+abc.getName()+" INVÁLIDO");
            }
        }
    public void tipGrav(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(40, 42);
            if (verif.isAlfa(a)) {
              //  System.out.println("TIPO DE GRAVAÇÃO DO ARQUIVO "+abc.getName()+" VÁLIDO");
            } else {
                System.out.println("TIPO DE GRAVAÇÃO DO ARQUIVO "+abc.getName()+" INVÁLIDO,");
            }
        }
    public void cordeEnt(Object[] list1, File abc) throws IOException {
            String a = list1[1].toString().substring(42, 44);
            if (verif.isAlfa(a)) {
              //  System.out.println("COR DE ENT DO ARQUIVO "+abc.getName()+" VÁLIDO");
            } else {
                System.out.println("COR DE ENT DO ARQUIVO "+abc.getName()+" INVÁLIDO");
            }
        }
    public void tipEnv(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(44, 46);
            if (verif.isInteger(a)) {
              //  System.out.println("TIPO DE ENVELOP. DO ARQUIVO "+ abc.getName()+" VÁLIDO");
            } else {
                System.out.println("TIPO DE ENVELOP. DO ARQUIVO "+ abc.getName()+" INVÁLIDO");
            }
        }
    public void tipEnd(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(46, 48);
            if (verif.isInteger(a)) {
             //   System.out.println("TIPO DE ENDEREÇAMENTO DO ARQUIVO "+abc.getName()+ " VÁLIDO");
            } else {
                System.out.println("TIPO DE ENDEREÇAMENTO DO ARQUIVO "+abc.getName()+ " INVÁLIDO");
            }
        }
    public void etiqBlo(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(48, 50);
            if (verif.isInteger(a)) {
             //   System.out.println("ETIQUETA DE BLOQ DO ARQUIVO "+abc.getName()+ " VÁLIDO");
            } else {
                System.out.println("ETIQUETA DE BLOQ DO ARQUIVO "+abc.getName()+ " INVÁLIDO");
            }
        }
    public void overlay(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(50, 52);
            if (verif.isInteger(a)) {
              //  System.out.println("OVERLAY DO ARQUIVO "+abc.getName()+ " VÁLIDO");
            } else {
                System.out.println("OVERLAY DO ARQUIVO "+abc.getName()+ " INVÁLIDO");
            }
        }
    public void postagem(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(52, 54);
            if (verif.isInteger(a)) {
             //   System.out.println("TIPO DE POSTAGEM DO ARQUIVO "+abc.getName()+ " VÁLIDO");
            } else {
                System.out.println("TIPO DE POSTAGEM DO ARQUIVO "+abc.getName()+ " INVÁLIDO");
            }
        }
    public void restLinha2(Object[] list1, File abc) throws IOException {

            String a = list1[1].toString().substring(54, 1200);
            if (a.trim().isEmpty()) {
              //  System.out.println("SEGUNDA LINHA DO ARQUIVO " + abc.getName() + " VÁLIDO");
            }else {
                System.out.println("ERRO NO FINAL DA SEGUNDA LINHA DO CABEÇALHO "+abc.getName());
            }
        }
    }







