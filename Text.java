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
    
    //Return Simple Text
    public static String writeRet(String s){
        return s;
    }
    
    //Write Simple Text, int n Number of times
    public static void write (String s, int n){
        for (int i = 0; i < n; i++){
            write(s);
        }
    }

    //Return Simple Text, int n Number of times
    public static String writeRet (String s, int n){
        String temp = "";
        for (int i = 0; i < n; i++){
            temp = temp + s;
        }
        return temp;
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
        
    }

    //Allows the user to toggle between a divider and/or space separator,
    // and then select the divider desired as a char
    // when repeating a single println statement (using writesl).
    public static void writesl(String s, int n, boolean space, boolean divider, char c){
        if (space && divider) {
            for (int i = 0; i < n; i++) {
                System.out.print(s + spaceRet() + c + spaceRet());
            }
        } else if (space){
            for (int i  = 0; i < n; i++){
                System.out.print(s + spaceRet());
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

    //Adds a space.
    public static void space(){
        writesl(" ");
    }

    //Returns a space.
    public static String spaceRet(){
        return " ";
    }

    //Adds n number of spaces
    public static void space(int n){
        for (int i = 0; i < n; i++){
            space();
        }
    }

    //Retunrs n number of spaces
    public static String spaceRet(int n){
        String s = "";
        for (int i = 0; i < n; i++){
            s = s + spaceRet();
        }
        return s;
    }









}
