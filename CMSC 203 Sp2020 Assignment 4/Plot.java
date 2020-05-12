public class Plot {
  private int x;
  private int y;
  private int width;
  private int depth;

  public Plot() {
    this.width = 1;
    this.depth = 1;
  }

  public Plot(Plot p) {
    this.x = p.x;
    this.y = p.y;
    this.width = p.width;
    this.depth = p.depth;
  }

  public Plot(int x, int y, int width, int depth) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.depth = depth;
  }

  public boolean overlaps(Plot p) {
	  int lx = x;
	  int ly = y;
	  int rx = x + width;
	  int ry = y + depth;
	  
	  int xl = p.x;
	  int yl = p.y;
	  int xr = p.x + p.width;
	  int yr = p.y + p.depth;
	  
	  boolean a = (xl >= rx || xr <= lx);
	  boolean b = (yl >= ry || yr <= ly);
	  
	  if (a || b)
		  return false;

	  else
		  return true;
  }

  public boolean encompasses(Plot p) {
	  int lx = x;
	  int ly = y;
	  int rx = x + width;
	  int ry = y + depth;
	  
	  int xl = p.x;
	  int yl = p.y;
	  int xr = p.x + p.width;
	  int yr = p.y + p.depth;
	  
	  boolean c = (xr <= rx && xl >= lx);
	  boolean d = (yr <= ry && yl >= ly);

	  if (c && d)
		  return true;
	  else
		  return false;
  }

  /**
   * @return the x
   */
  public int getX() {
    return x;
  }

  /**
   * @param x the x to set
   */
  public void setX(int x) {
    this.x = x;
  }

  /**
   * @return the y
   */
  public int getY() {
    return y;
  }

  /**
   * @param y the y to set
   */
  public void setY(int y) {
    this.y = y;
  }

  /**
   * @return the width
   */
  public int getWidth() {
    return width;
  }

  /**
   * @param width the width to set
   */
  public void setWidth(int width) {
    this.width = width;
  }

  /**
   * @return the depth
   */
  public int getDepth() {
    return depth;
  }

  /**
   * @param depth the depth to set
   */
  public void setDepth(int depth) {
    this.depth = depth;
  }

  @Override
  public String toString() {
    return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth:" + depth;
  }


}