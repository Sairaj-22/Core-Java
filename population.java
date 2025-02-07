public class population {
  public static void main(String args[]) {
    long curPop = 312032486;
    final long sec = (365 * 24 * 60 * 60) * 5;
    Long birth = sec / 7;
    Long death = sec / 13;
    Long imm = sec / 45;

    Long newPop = curPop + birth - death + imm;
    System.out.println("The population after 5 year will be: " + newPop);
  }
}
