public class primitivetypechallenge {
    public static void main(String[] args){
        byte bytevariable = 6;
        short shortvariable = 123;
        int intvariable = 45678;

        long longvariable = 50000+10*((int)bytevariable+(int)shortvariable+intvariable);

        System.out.println("The result of the challenge is: "+longvariable);
    }
}
