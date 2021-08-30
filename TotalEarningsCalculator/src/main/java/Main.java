public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    int result = 0;

    int vasyaStartIndex = text.indexOf('5');
    int vasyaEndIndex = text.indexOf(' ', vasyaStartIndex);
    String vasyaMoney = text.substring(vasyaStartIndex, vasyaEndIndex);

    int petyStartIndex = text.indexOf('-') + 2;
    int petyEndIndex = text.indexOf(' ', petyStartIndex);
    String petyMoney = text.substring(petyStartIndex, petyEndIndex);

    int mashaStartIndex = text.lastIndexOf('3');
    int mashaEndIndex = text.indexOf(' ', mashaStartIndex);
    String mashaMoney = text.substring(mashaStartIndex, mashaEndIndex);
    result = Integer.parseInt(vasyaMoney) + Integer.parseInt(petyMoney) + Integer.parseInt(mashaMoney);
    System.out.println(result);
  }
}