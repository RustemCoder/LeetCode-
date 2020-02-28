#include <iostream>
#include <string>
using namespace std ;

class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum =0;
        int product=1;
        while(n>0)
        {
            sum =sum +n%10;
            product = product*(n%10);
            n = n/10;
        };
        return product-sum;
    }
};

int stringToInteger(string input) {
    return stoi(input);
}

int main() {
    string line;
    while (getline(cin, line)) {
        int n = stringToInteger(line);
        
        int ret = Solution().subtractProductAndSum(n);

        string out = to_string(ret);
        cout << out << endl;
    }
    return 0;
}