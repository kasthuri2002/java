//length of last word	
class Lolw {
    public int lengthOfLastWord(String s) {
       // s=s.trim();
        String [] str = s.split(" ");
       // return s.length();
       return str[str.length -1].length();
    }
    public static void main(String[] args){
        Lolw obj = new Lolw();
        System.out.println(obj.lengthOfLastWord("Hello World"));
        System.out.println(obj.lengthOfLastWord("fly me   to   the moon"));
        System.out.println(obj.lengthOfLastWord("luffy is still joyboy"));
    }
}