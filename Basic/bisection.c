//bisection method for for x cuibe - x - 2= 0 upto 2 decimal places shpw full calcultion table form where two decoimal places is seen in each step
#include <stdio.h>
#include <math.h>
#define f(x) (pow(x,3) - x - 2)
int main() {
    float a = 1.0, b = 2.0, c, fa, fb, fc;
    int i = 0;

    printf("a\tb\tc\tf(a)\tf(b)\tf(c)\n");
    while (i < 10) { // Limit iterations to prevent infinite loop
        c = (a + b) / 2; // Midpoint
        fa = f(a);
        fb = f(b);
        fc = f(c);

        printf("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", a, b, c, fa, fb, fc);

        if (fabs(fc) < 0.01) { // Check if root is found within tolerance
            break;
        } else if (fa * fc < 0) { // Root is in [a, c]
            b = c;
        } else { // Root is in [c, b]
            a = c;
        }
        i++;
    }

    printf("Approximate root: %.2f\n", c);
    return 0;
}