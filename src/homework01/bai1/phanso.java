package homework01.bai1;

public class phanso {
	private int x;
	private int y;
	public phanso() {
		this.x = 0;
		this.y = 1;
	}
	public phanso(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return x + "/" +y  ;
	}
	public phanso tong(phanso ps) {
        int tongX = this.x * ps.y + this.y * ps.x;
        int tongY = this.y * ps.y;
        return new phanso(tongX, tongY);
    }
	public phanso hieu(phanso ps) {
        int hieuX = this.x * ps.y - this.y * ps.x;
        int hieuY = this.y * ps.y;
        return new phanso(hieuX, hieuY);
    }

    public phanso tich(phanso ps) {
        int tichX = this.x * ps.x;
        int tichY = this.y * ps.y;
        return new phanso(tichX, tichY);
    }

    public phanso thuong(phanso ps) {
        int thuongX = this.x * ps.y; 
        int thuongY= this.y * ps.x;
        return new phanso(thuongX, thuongY);
    }
    public String sosanh(phanso ps) {
    	int X1 = this.x * ps.y;
    	int X2 = ps.x * this.y;
    	if(X1>X2) return "phan so 1 lon hon";
    	if(X2>X1) return "phan so 2 lon hon";
    	if(X1==X2) return "2 phan so bang nhau";
		return null;
    }
    private int gcd() {
        int i;
        if (x < y)
            i = x;
        else
            i = y;

        for (i = i; i > 1; i--) {

            if (x % i == 0 && y % i == 0)
                return i;
        }

        return 1;
    }

    public void rutGon() {
        int uocChung = gcd();
        this.x = x/ uocChung ;
        this.y = y /uocChung;
    }

}
