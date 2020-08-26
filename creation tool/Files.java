import java.io.*;


public class Files {
    public static Throwable create(String root, int spec) {
        /*
        0x-dele
            00-all
            01-resources folder
            02-behaviors folder
            0x3-items
            0x4-entities
            0x5-blocks
        1x-reso
        2x-beha
        3x-both
        */
        try {
            
            File commands = File.createTempFile("temp", ".bat");
            System.out.println(commands.getAbsolutePath());
            String out;

            switch (spec) {
                case 0:
                    out = "CD "+root+"\n@RD /S /Q "+'"'+root+'"'+"\nexit";
                    break;
                case 1:
                    out = "CD "+root+"\n@RD /S /Q "+'"'+root+"/resources"+'"'+"\nexit";
                    break;
                default:
                    return new Throwable("Invalid option for file operation");
            }

            FileWriter w = new FileWriter(commands);
            w.write(out);
            w.close();
            Process p = Runtime.getRuntime().exec("cmd /c start "+commands.getAbsolutePath());
            p.waitFor(); 
            
            return null;
        } catch (Exception e) {
            return e;
        }
    }
    public static boolean check(){
        return true;
    }
}





