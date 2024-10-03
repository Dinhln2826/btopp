public class Rectangle {
    float length = 1.0f;
    float width = 1.0f;
    public Rectangle(float width, float length){
    this.width=width;
    this.length=length;
    }
    public float getwidth(){
        return width;
    }
    public float getlength(){
        return length;
    }
    public void setwidth(float width)
    {
        this.width = width;
    }
    public void setlength(float length)
    {
        this.length = length;
    }
        public double getArea()
        {
            return width * length;
        }
        public double getPerimeter()
        {
            return 2 * width * length;
        }
        public String toString()
        {
            return "Rectangle [width=" + width + ", length=" + length + "]";
        }
    }
