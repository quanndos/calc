package res;
public class CountRez {

	public int calc(int n1, String op, int n2) {
        int rez = 0;
    switch (op) {
        case "+":
        rez = n1 + n2;
        break;
        case "-":
        rez = n1-n2;
        break;
        default:
        rez = 0;
        break; 
        }
    return rez;
    }
    
}
