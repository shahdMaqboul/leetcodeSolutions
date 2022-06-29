/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfFour = function(n) {
    while(n>=4){
        if(n%4 != 0) return false;
        n=n/4;
    }
    return n==1;
};
// This video helped me to understand the problem in a better way.
// https://www.youtube.com/watch?v=GNb8vSyw-WE