class Main {
  public static void main(String[] args) {
    System.out.println(alphabetWar("w"));
  }



    public static String alphabetWar(String fight){

        String [] temp = fight.split("");
        int left = 0; 
        int right = 0;
        
        for(String s : temp){
            char letter = s.charAt(0);
            switch(letter){
                case 'w':
                    left += 4;
                    break;
                case 'p':
                    left += 3;
                    break;
                case 'b':
                    left += 2;
                    break;
                case 's':
                    left += 1;
                    break;
                case 'm':
                    right += 4;
                    break;
                case 'q':
                    right += 3;
                    break;
                case 'd':
                    right += 2;
                    break;
                case 'z':
                    right += 1;
                    break;

            }
        }


        return right > left ? "Right side wins!" : left > right ? "Left side wins!" : "Let's fight again!";
    }

}