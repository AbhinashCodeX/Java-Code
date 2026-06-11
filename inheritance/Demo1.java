


interface photoclicked{
    void click();
}
interface musicplayed{
    void playmusic();
}
interface games{
    void gamer();
    public void cod();
}
class phone implements photoclicked,musicplayed,games{
    @Override
    public void click() {
        System.out.println("Clicking Images");
    }
    @Override
    public void playmusic() {
        System.out.println("Phone can play music");
    }
    @Override
    public void gamer() {
        System.out.println("We are playing games right now");
    }

    public void cod(){
        System.out.println("Call of Deauty loading");
    }
}
public class Demo1 {
    public static void main(String[] args) {
phone p = new phone();
p.click();
p.playmusic();
p.gamer();
p.cod();
    }
}
