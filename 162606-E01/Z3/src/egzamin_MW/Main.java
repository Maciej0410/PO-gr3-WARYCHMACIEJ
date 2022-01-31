package egzamin_MW;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	    String path = "D:\\egzamin\\do_po";

    }
}
class zad_3
{
    public static File[] lista(String path){
        File lok = new File(path);

        return lok.listFiles(x->{
            if(x.isDirectory()){
               return true; 
            }
            
            if (!(x.isDirectory())){
                return true;
            }
        });
    }
}