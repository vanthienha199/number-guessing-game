public class Guessing {
    int answer = (int) (Math.random() * 100);
    public String guessing(int num) {
        if (num < answer) {
            return "Higher. Please guess again";
        } else if (num > answer) {
            return "Lower. Please guess again";
        } else {
            return "You are correct";
        }
    }
}
