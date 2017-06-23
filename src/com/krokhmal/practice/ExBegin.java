package com.krokhmal.practice;

/**
 * Created by User on 20.05.2017.
 */
public class ExBegin {
    public static void main(String[] args) {
        //Абромян сборник задач.
		//Begin 1
		double a =  1.5;
		double P = 4 * a;
		System.out.println("Begin 1: a = 1.5; P = 4 * a; P = " + P);
		
		//Begin 2
		double S = Math.pow(a, 2);
		System.out.println("Begin 2: a = 1.5; S = a * a; S = " + S);
		
		//Begin 3
		double b = 5.5;
		S = a * b;
		System.out.println("Begin 3: a = 1.5; b = 5.5;");
		System.out.println("   S = a * b; S = " + S);
		P = 2 * (a + b);
		System.out.println("   P = 2 * (a + b); P = " + P);

		//Begin 4
        double d = 5.0;
        double L = Math.PI * d;
        System.out.println("Begin 4: d = 5.0; L = PI * d; L = " + L);

        //Begin 5
        a = 4;
        System.out.println("Begin 5: a = 4;");
        double V = Math.pow(a, 3);
        System.out.println("   V = a ^ 3; V = " + V);
        S = 6 * Math.pow(a,2);
        System.out.println("   S = 6 * a * a; S = " + S);

        //Begin 6
        a = 4.8;
        b = 5.6;
        double c = 4.0;
        System.out.println("Begin 6: a = 4.8; b = 5.6; c = 4.0");
        V = a * b * c;
        System.out.println("   V = a * b * c; V = " + V);
        S = 2 * (a * b + b * c + c * a);
        System.out.println("   S = 2 * (a * b + b * c + c * a); S = " + S);

        //Begin 7
        double R = 5.0;
        System.out.println("Begin 7: R = 5.0;");
        L = 2 * Math.PI * R;
        System.out.println("   L = 2 * PI * R; L = " + L);
        S = Math.PI * Math.pow(R, 2);
        System.out.println("   S = PI * R ^ 2; S = " + S);

        //Begin 8
        a = 5.7;
        b = 9.8;
        double Middle = (a + b) / 2;
        System.out.println("Begin 8: a = 5.7; b = 9.8; Middle = (a + b) / 2; Middle = " + Middle);

        //Begin 9
        a = 4.5;
        b = 7.2;
        double MidGeom = Math.sqrt(a * b);
        System.out.println("Begin 9: a = 4.5; b = 7.2; MidGeom = SQRT(a * b); MidGeom = " + MidGeom);

        //Begin 10
        a = 3.2;
        b = 8.3;
        System.out.println("Begin 10: a = 3.2; b = 8.3\n   a + b = " + (a + b));
        System.out.println("   a * b = " + (a * b));
        System.out.println("   a / b = " + (a / b));
        System.out.println("   a^2 / b^2 = " + (Math.pow(a, 2) / Math.pow(b, 2)));

        //Begin 11
        a = -2.3;
        b = 5.9;
        System.out.println("Begin 11: a = -2.3; b = 5.9\n   |a| + |b| = " + (Math.abs(a) + Math.abs(b)));
        System.out.println("   |a| * |b| = " + (Math.abs(a) * Math.abs(b)));
        System.out.println("   |a| / |b| = " + (Math.abs(a) / Math.abs(b)));
        System.out.println("   |a|^2 / |b|^2 = " + (Math.pow(Math.abs(a), 2) / Math.pow(Math.abs(b), 2)));

        //Begin 12
        c = Math.sqrt(Math.pow(3.7, 2) + Math.pow(4.9, 2));
        System.out.println("Begin 12: c = SQRT(3.7^2 + 4.9^2); c = " + c);

        //Begin 13
        double R1 = 3.3;
        double R2 = 1.7;
        System.out.println("Begin 13: R1 = 3.3; R2 = 1.7;");
        double S1 = Math.PI * Math.pow(R1, 2);
        System.out.println("   S1 = PI* R1^2; S1 = " + S1);
        double S2 = Math.PI * Math.pow(R2, 2);
        System.out.println("   S2 = PI* R1^2; S2 = " + S2);
        System.out.println("   S3 = S1 - S2; S3 = " + (S1 - S2));

        //Begin 14
        L = 12.5;
        R = L / (2 * Math.PI);
        System.out.println("Begin 14: L = 12.5;\n   R = L / (2 * PI); R = " + R);
        S = 2 * Math.PI * Math.pow(R, 2);
        System.out.println("   S = 2 * PI * R^2; S = " + S);

        //Begin 15
        S = 15.6;
        System.out.println("Begin 15: S = 15.6;");
        double D = 2 * Math.sqrt(S / Math.PI);
        L = D / Math.PI;
        System.out.println("   D = 2 * SQRT((S / PI)); D = " + D);
        System.out.println("   L = D * PI; L = " + L);

        //Begin 16
        double x1 = 45;
        double x2 = 76;
        L = Math.abs(x2 - x1);
        System.out.println("Begin 16: x1 = 45; x2 = 76; |x2 - x1| = " + L);

        //Begin 17
        a = 12;
        b = 32;
        c = 45;
        System.out.println("Begin 17: a = 12; b = 32; c = 45;");
        double ab = Math.abs(b - a);
        System.out.println("   ab = |b - a| = " + ab);
        double bc = Math.abs(c - b);
        System.out.println("   bc = |c - b| = " + bc);
        System.out.println("   ab + bc = " + (ab + bc));

        //Begin 18
        a = 23;
        b = 53;
        c = 33;
        L = Math.abs(c - a) * Math.abs(b - c);
        System.out.println("Begin 18: a = 23; b = 53; c = 33; ac * cb = " + L);

        //Begin 19
        x1 = 10;
        double y1 = 15;
        x2 = 33;
        double y2 = 42;
        System.out.println("Begin 19: (x1 = 10; y1 = 15) (x2 = 33; y2 = 42)");
        P = 2 * ((x2 - x1) + (y2 -y1));
        System.out.println("   Perimeter is " + P);
        S = (x2 - x1) * (y2 -y1);
        System.out.println("   Square is " + S);

        //Begin 20
        x1 = 3;
        x2 = 4;
        y1 = 8;
        y2 = 9;
        System.out.println("Begin 19: (x1 = 3; y1 = 8) (x2 = 4; y2 = 9)");
        L = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("   Length between (x1,y1) and (x2,y2) is " + L);

        //Begin 21
        x1 = 3; y1 = 2;
        x2 = 10; y2 = 12;
        double x3 = 15, y3 = 6;
        a = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
        b = Math.sqrt(Math.pow(Math.abs(x3 - x2), 2) + Math.pow(Math.abs(y3 - y2), 2));
        c = Math.sqrt(Math.pow(Math.abs(x1 - x3), 2) + Math.pow(Math.abs(y1 - y3), 2));
        P = a + b + c;
        System.out.println("   Triangle perimeter is " + P);
        P = P / 2;
        S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        System.out.println("   Triangle square is " + S);

        //Begin 22
        a = 56;
        b = 32;
        System.out.println("Begin 22: a = " + a + "; b = " + b);
        a = a + b - (b = a);
        System.out.println("          a = " + a + "; b = " + b);

        //Begin 23
        a = 56;
        b = 32;
        c = 16;
        System.out.println("Begin 23: a = " + a + "; b = " + b + "; c = " + c);
        b = a + b - (a = b);
        c = b + c - (b = c);
        a = c + a - (c = a);
        System.out.println("          a = " + a + "; b = " + b + " c = " + c);

        //Begin 24
        a = 23;
        b = 13;
        c = 2;
        System.out.println("Begin 24: a = " + a + "; b = " + b + "; c = " + c);
        c = a + c - (a = c);
        b = b + c - (c = b);
        a = b + a - (b = a);
        System.out.println("          a = " + a + "; b = " + b + " c = " + c);

        //Begin 25
        double x = 3;
        double y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7;
        System.out.println("Begin 25: x = " + x + "; y = 3*x^6 - 6*x^2 - 7 = " + y);

        //Begin 26
        x = 5;
        y = 4 * Math.pow(x - 3, 6) - 7 * Math.pow(x - 3, 3) + 2;
        System.out.println("Begin 26: x = " + x + "; y = 4*(x-3)^6 - 6*(x-3)^2 +2 = " + y);

        //Begin 27
        double A = 2;
        double a1 = A * A;
        a1 = a1 * a1;
        System.out.print("Begin 27: A = " + A);
        A  = a1 * a1;
        System.out.println("; A^8 = " + A);

        //Begin 28
        A = 2;
        System.out.print("Begin 28: A = " + A);
        a1 = A * A;
        double a2 = a1 * A;
        a2 = a1 * a2;
        a1 = a2;
        a2 = a2 * a2;
        A = a2 * a1;
        System.out.println(" A^15 = " + A);

        //Begin 29
        a = 90;
        System.out.println("Begin 29: a = " + a + "; radian(a) = " + (a * 2 * Math.PI / 360));

        //Begin 30
        a = 3.1415927;
        System.out.println("Begin 30: a = " + a + "; angle(a) = " + (a * 360 / (2 * Math.PI) ));

        //Begin 31
        double Tf = 36.6;
        double Tc = (Tf - 32) * 5 / 9;
        System.out.println("Begin 31: Tf = " + Tf + "; Tc = " + Tc);

        //Begin 32
        Tc = 23;
        Tf = Tc * 9/5 + 32;
        System.out.println("Begin 32: Tc = " + Tc + "; Tf = " + Tf);

        //Begin 33
        A = 6;
        double X = 3;
        double A1 = A / X;
        double Y = 5 * A1;
        System.out.println("Begin 33: " + A + " grn. for " + X + " kg candies. 1 kg cost " + Y + " grn.");

        //Begin 34
        X = 3;
        A = 64;
        Y = 4;
        double B = 46;
        A1 = A / X;
        double B1 = B / Y;
        System.out.println("Begin 34: " + A + " grn. for " + X + " kg candies. 1 kg cost " + Y + " grn.");
        System.out.println("   " + B + " grn. for " + Y + " iris kg . 1 kg cost " + Y + " grn.");
        System.out.println("   Candies in " + (A1 / B1) +" times more, then iris");

        //Begin 35
        V = 45;
        double U = 5;
        double T1 = 4;
        double T2 = 5;
        System.out.println("Begin 35: way passed by bout is " + ((V * T1) + ((V - U) * T2)) + " km.");

        //Begin 36
        V = 60;
        U = 80;
        S = 300;
        double T = 2;
        System.out.println("Begin 36: In " + T + " hours cars will be " +
                            (S + (V  + U) * T)
                            + " km away from each other.");

        //Begin 37
        V = 120;
        U = 100;
        S = 800;
        T = 3;
        System.out.println("Begin 37: In " + T + " hours cars will be " +
                (Math.abs(S - (V  + U) * T))
                + " km away from each other.");

        //Begin 38
        A = 45;
        B = 39;
        x = B / A;
        System.out.println("Begin 38: " + A +"x + " + B + " = 0; x = " + x);

        //Begin 39
        A = 5;
        B = 13;
        double C = 3;
        D = Math.pow(B, 2) - 4 * A * C;
        x1 = ((- B - Math.sqrt(D))/ (2 * A));
        x2 = ((- B + Math.sqrt(D))/ (2 * A));
        System.out.println("Begin 39: A*x^2+B*x+C = 0; x_min = " + x1 + " ; x_max = " + x2);

        //Begin 40
        A1 = 10;
        double A2 = 23;
        B1 = 45;
        double B2 = 32;
        double C1 = 54;
        double C2 = 41;
        D = (A1 * B2 - A2 * B1);
        x = (C1 * B2 - C2 * B1) / D;
        y = (A1 * C2 - A2 * C1) / D;
        System.out.println("Begin 40: A1*x+B1*y=C1, A2*x+B2*y=C2; x = " + x + "; y = " + y);
    }
}
