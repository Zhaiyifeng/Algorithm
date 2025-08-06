//
// Created by a1853 on 25-8-5.
//
#include <cstdio>

int main() {
    // 快速IO优化
    setbuf(stdout, nullptr);
    setbuf(stdin, nullptr);
    
    double sum;
    scanf("%lf", &sum);
    
    // 转换为分（cents）来避免浮点数精度问题
    int cents = (int)(sum * 100 + 0.00000001); // 更准确的四舍五入
    
    // 钞票面值（以分为单位）
    static const int notes[] = {10000, 5000, 2000, 1000, 500, 200};
    // 硬币面值（以分为单位）
    static const int coins[] = {100, 50, 25, 10, 5, 1};
    
    // 预计算面值的浮点表示
    static const double note_values[] = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
    static const double coin_values[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

    puts("NOTAS:");
    for (int i = 0; i < 6; i++) {
        int count = cents / notes[i];
        cents %= notes[i];
        printf("%d nota(s) de R$ %.2f\n", count, note_values[i]);
    }
    
    puts("MOEDAS:");
    for (int i = 0; i < 6; i++) {
        int count = cents / coins[i];
        cents %= coins[i];
        printf("%d moeda(s) de R$ %.2f\n", count, coin_values[i]);
    }
    
    return 0;
}
// //
// // Created by a1853 on 25-8-5.
// // 上帝模式 - 真正的极致优化版本
// //
// #include <cstdio>
// #include <cstring>
//
//
// template<int cents>
// struct PrecomputedResult {
//     static constexpr int c100 = cents / 10000;
//     static constexpr int c50 = (cents % 10000) / 5000;
//     static constexpr int c20 = (cents % 5000) / 2000;
//     static constexpr int c10 = (cents % 2000) / 1000;
//     static constexpr int c5 = (cents % 1000) / 500;
//     static constexpr int c2 = (cents % 500) / 200;
//     static constexpr int m100 = (cents % 200) / 100;
//     static constexpr int m50 = (cents % 100) / 50;
//     static constexpr int m25 = (cents % 50) / 25;
//     static constexpr int m10 = (cents % 25) / 10;
//     static constexpr int m5 = (cents % 10) / 5;
//     static constexpr int m1 = cents % 5;
// };
//
//
// static constexpr const char* digit_table[100000] = {
//     "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
//
// };
//
// inline int lightning_fast_itoa(int num, char* str) {
//     if (num == 0) {
//         *str = '0';
//         return 1;
//     }
//
//
//     char* start = str;
//
//     if (num < 10) {
//         *str++ = '0' + num;
//     } else if (num < 100) {
//         *str++ = '0' + (num / 10);
//         *str++ = '0' + (num % 10);
//     } else if (num < 1000) {
//         *str++ = '0' + (num / 100);
//         num %= 100;
//         *str++ = '0' + (num / 10);
//         *str++ = '0' + (num % 10);
//     } else if (num < 10000) {
//         *str++ = '0' + (num / 1000);
//         num %= 1000;
//         *str++ = '0' + (num / 100);
//         num %= 100;
//         *str++ = '0' + (num / 10);
//         *str++ = '0' + (num % 10);
//     } else {
//         *str++ = '0' + (num / 10000);
//         num %= 10000;
//         *str++ = '0' + (num / 1000);
//         num %= 1000;
//         *str++ = '0' + (num / 100);
//         num %= 100;
//         *str++ = '0' + (num / 10);
//         *str++ = '0' + (num % 10);
//     }
//
//     return str - start;
// }
//
// // 预编译的字符串常量
// static constexpr const char NOTAS[] = "NOTAS:\n";
// static constexpr const char MOEDAS[] = "MOEDAS:\n";
// static constexpr const char NOTA_100[] = " nota(s) de R$ 100.00\n";
// static constexpr const char NOTA_50[] = " nota(s) de R$ 50.00\n";
// static constexpr const char NOTA_20[] = " nota(s) de R$ 20.00\n";
// static constexpr const char NOTA_10[] = " nota(s) de R$ 10.00\n";
// static constexpr const char NOTA_5[] = " nota(s) de R$ 5.00\n";
// static constexpr const char NOTA_2[] = " nota(s) de R$ 2.00\n";
// static constexpr const char MOEDA_100[] = " moeda(s) de R$ 1.00\n";
// static constexpr const char MOEDA_50[] = " moeda(s) de R$ 0.50\n";
// static constexpr const char MOEDA_25[] = " moeda(s) de R$ 0.25\n";
// static constexpr const char MOEDA_10[] = " moeda(s) de R$ 0.10\n";
// static constexpr const char MOEDA_5[] = " moeda(s) de R$ 0.05\n";
// static constexpr const char MOEDA_1[] = " moeda(s) de R$ 0.01\n";
//
//
// inline void lightning_build_output(int cents, char* output) {
//     // 计算各面值 - 直接计算避免复杂优化
//     int c100 = cents / 10000; cents %= 10000;
//     int c50 = cents / 5000;   cents %= 5000;
//     int c20 = cents / 2000;   cents %= 2000;
//     int c10 = cents / 1000;   cents %= 1000;
//     int c5 = cents / 500;     cents %= 500;
//     int c2 = cents / 200;     cents %= 200;
//     int m100 = cents / 100;   cents %= 100;
//     int m50 = cents / 50;     cents %= 50;
//     int m25 = cents / 25;     cents %= 25;
//     int m10 = cents / 10;     cents %= 10;
//     int m5 = cents / 5;       cents %= 5;
//     int m1 = cents;
//
//     sprintf(output,
//         "NOTAS:\n"
//         "%d nota(s) de R$ 100.00\n"
//         "%d nota(s) de R$ 50.00\n"
//         "%d nota(s) de R$ 20.00\n"
//         "%d nota(s) de R$ 10.00\n"
//         "%d nota(s) de R$ 5.00\n"
//         "%d nota(s) de R$ 2.00\n"
//         "MOEDAS:\n"
//         "%d moeda(s) de R$ 1.00\n"
//         "%d moeda(s) de R$ 0.50\n"
//         "%d moeda(s) de R$ 0.25\n"
//         "%d moeda(s) de R$ 0.10\n"
//         "%d moeda(s) de R$ 0.05\n"
//         "%d moeda(s) de R$ 0.01\n",
//         c100, c50, c20, c10, c5, c2, m100, m50, m25, m10, m5, m1);
//
//
// int main() {
//
//     setbuf(stdin, nullptr);
//     setbuf(stdout, nullptr);
//
//
//     double sum;
//     scanf("%lf", &sum);
//
//
//     int cents = (int)(sum * 100.0 + 0.5);
//
//
//     alignas(64) static char output[512];
//
//
//     lightning_build_output(cents, output);
//
//
//     fputs(output, stdout);
//
//     return 0;
// }