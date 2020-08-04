
    static boolean flag = false;
    static int B, H;
    static
    {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        try
        {
            if(B <= 0 || H <= 0)
            {
                throw new Exception("Breadth and height must be positive");
            }
            else
            {
                flag = true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }




