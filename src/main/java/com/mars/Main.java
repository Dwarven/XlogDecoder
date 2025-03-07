package com.mars;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Usage:\n java -jar XlogDecoder.jar [PRIV_KEY] [infile]\nor:\n java -jar XlogDecoder.jar [PRIV_KEY] [infile] [outfile]");
            return;
        }
        String priv_key, infile, outfile;
        priv_key = args[0];
        infile = args[1];
        if (args.length<3) {
            outfile = infile + ".log";
        }else {
            outfile = args[2];
        }
        XlogFileDecoder.ParseFile(priv_key, infile, outfile);
    }
}
