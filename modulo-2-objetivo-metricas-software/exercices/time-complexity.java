// Grupo: Joaquin Godoy, Maria del Mar Cegarra

int mod(int a, int b) {  // Inicial: 1  
    if (b <=a) return -1; // comparacion = 1
    int div = a / b; // asig + arit = 1+1 = 2
    return a - div * b; arit +arit = 1+1 = 2
} // Total= 6 -> O(1) -> Constante

int product(int a, int b) { // inicial: 1 
    int sum = 0; // asig = 1
    for (int I = 0; I < b; I++) { // asig + comparacion + ( i = i + 1 ) asig + arit = 4
        sum += a; // asig + arit = 2
    }
    return sum;
} // Total = 1 + 1 + (4 + 2)* n = O(n) -> Lineal

static int power(int a, int b) { // Inicial = 1
    if (b < 0) return a; // comparacion = 1
    if (b == 0) return 1; // comparacion = 1
    int sum = a; // asig = 1
    for (int I = 0; I < b - 1; I++) { // asig + (comp + arit) + (asig + arit) = 5
        sum *= a; // asig + arit = 2
    }
    return sum;
} // Total= 1 + 1 + (5 + 2)* n -> O(n) -> Lineal

int div(int a, int b) { //Inicial = 1
    int count = a; // asig = 1
    int sum = b; // asig = 1
    while (sum <= a) { // comparacion = 1
        sum += b; // asig + arit = 2
        count++; // asig + arit = 2
    }
    return count;
} // Total = 1 + 1 + 1 + (5)*n = O(n) -> Lineal

int[] copyArray(int[] array) {
    int[] copy = new int[0];
    for (int value : array) {
        copy = appendToNew(copy, value);
    }
    return copy;
} // Total = n (por el for) * O(n) (de appendToNew) -> O(n^2) -> Cuadratica

int[] appendToNew(int[] array, int value) {
    int[] bigger = new int[array.length + 1];
    for (int I = 0; I < array. length; I++) {
        bigger[I] = array[I];
    }
    bigger[bigger.length - 1] = value;
    return bigger;
} // Total = 1 + (1 + 1 + 1) + (5 + 3)*n + 4 = O(n) -> Lineal 

int sqrt(int n) {
    return sqrt_helper(n, 1, n);
}

int sqrt_helper(int n, int min, int max) {
    if (max < min) return -1; // 1
    int guess = (min + max) / 2; // 3
    if (guess * guess == n) { // 2
        return guess;
    } else if (guess *guess <n) { // 2
        return sqrt_helper(n, guess + 1, max) ; 
    } else {
        return sqrt_helper(n, min, guess - 1); 
    }
} // Total = 
