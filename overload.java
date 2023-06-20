class overload{
    
        static void add(int a,int b)
        {
            System.out.println(a+b);
    }
    static void add(float a,float b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        float c= 10.1f;
        float d= 11.2f;
    
        add(a,b);
        add(c,d);
    }
    }
