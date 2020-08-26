import org.apache.commons.cli.*;

class EXE {
    public static void main(String[] args) throws Exception{
        //Options options = readArgs(args);
        
        //final Throwable fileOut = Files.create(options.getOption("directory").getValue(), Integer.valueOf(options.getOption("mode").getValue()));
        final Throwable fileOut = Files.create("E:/bedrock-dev/creation tool/hue/f", 0); 
        if (fileOut !=null) System.out.println(fileOut);
    }

    public static Options readArgs (String[] args) {
        Options options = new Options();

        Option directory = new Option("d", "directory", true, "input directory");
        directory.setRequired(true);
        options.addOption(directory);

        Option mode = new Option("m", "mode", true, "mode: 0-delete files");
        mode.setRequired(true);
        options.addOption(mode);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;
        String inputFilePath;
        int inputMode;
        try {
            cmd = parser.parse(options, args);
            inputFilePath = cmd.getOptionValue("input");
            inputMode = Integer.valueOf(cmd.getOptionValue("mode"));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
        }

        return options;
    }

}