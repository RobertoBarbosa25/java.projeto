package PROJETO1;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;

public class VerificarArquivos {
    public static void main(String[] args) throws IOException {

        HeaderGeral asd = new HeaderGeral();
        asd.Header();

        HeaderLote asdd = new HeaderLote();
        asdd.Header1();
        //Detalhe aff = new Detalhe();
        //aff.detalhe2();
        TraillerLote trailer = new TraillerLote();
        trailer.TraillerLote2();

        TraillerGeral trailer1 = new TraillerGeral();
        trailer1.traillerG();
    }
}





