public class Text {
    /**
     * This toolbox class deals with text based outputs.
     * For example, print() statements, println() statements, and more.
     * Line skips are also included.
     * */
    public static void main(String [] args) {
        String t = "Testing!";
        writesl(t,5,true);
    }

    //Write Simple Text
    public static void write(String s){
        System.out.println(s);
    }

    //Write Simple Text, a Number of times
    public static void write (String s, int n){
        for (int i = 0; i < n; i++){
            write(s);
        }
    }

    //Write Simple Text
    public static void writesl(String s){
        System.out.print(s);
    }

    //Write Simple Text, a Number of times ;
    public static void writesl (String s, int n){
        for (int i = 0; i < n; i++){
            writesl(s);
        }
    }

    //Allows for writesl or writeSL to work.
    //Just makes it easier for programmer preference.
    public static void writeSl (String s, int n){
        writesl(s,n);
    }

    //Writes a single line with the space option.
    public static void writesl (String s, int n, boolean space){
        for (int i = 0; i < n; i++){
            writesl(s);
            if (space) writesl(" ");
        }
    }


    //Allows the user to toggle between a divider and/or space separator
    // when repeating a single println statement (using writesl).
    public static void writesl(String s, int n, boolean space, boolean divider){
        if (space && divider) {
            for (int i = 0; i < n; i++) {
                System.out.print(s + " | ");
            }
        } else if (space){
            for (int i  = 0; i < n; i++){
                System.out.print(s + " ");
            }
        } else if (divider){
            for (int i  = 0; i < n; i++){
                System.out.print(s + "|");
            }
        } else {
            for (int i  = 0; i < n; i++){
                System.out.print(s);
            }
        }
        b();
    }

    //Allows the user to toggle between a divider and/or space separator,
    // and then select the divider desired as a char
    // when repeating a single println statement (using writesl).
    public static void border (String s, int n, boolean space, boolean divider, char c){
        if (space && divider) {
            for (int i = 0; i < n; i++) {
                System.out.print(s + " " + c + " ");
            }
        } else if (space){
            for (int i  = 0; i < n; i++){
                System.out.print(s + " ");
            }
        } else if (divider){
            for (int i  = 0; i < n; i++){
                System.out.print(s + c);
            }
        } else {
            for (int i  = 0; i < n; i++){
                System.out.print(s);
            }
        }
        b();
    }

    //Skips a line.
    public static void b() {
        write("");
    }

    //Skips n number of lines.
    public static void b(int n){
        for (int i = 0; i < n; i++){
            b();
        }
    }

    //Ads a space.
    public static void space(){
        writesl(" ");
    }

    //Ads n number of spaces
    public static void space(int n){
        for (int i = 0; i < n; i++){
            space();
        }
    }









}
