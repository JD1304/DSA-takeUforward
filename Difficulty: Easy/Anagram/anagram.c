//{ Driver Code Starts
// Initial Template for C
#include <stdbool.h>
#include <stdio.h>
#include <string.h>


// } Driver Code Ends

// User function Template for C


bool areAnagrams(char s1[], char s2[]) {
    int count[256] = {0}; // ASCII characters frequency array

    // If lengths are different, they cannot be anagrams
    if (strlen(s1) != strlen(s2)) {
        return false;
    }

    // Count frequency of characters in s1 and s2
    for (int i = 0; s1[i] != '\0'; i++) {
        count[(unsigned char)s1[i]]++;  // increment for s1
        count[(unsigned char)s2[i]]--;  // decrement for s2
    }

    // Check if all counts are zero
    for (int i = 0; i < 256; i++) {
        if (count[i] != 0) {
            return false;
        }
    }

    return true;
}


//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d\n", &t);

    while (t--) {
        // Dynamically allocate memory for strings
        char *c = (char *)malloc(100005 * sizeof(char));
        char *d = (char *)malloc(100005 * sizeof(char));

        // Input the strings
        scanf("%s\n", c);
        scanf("%s\n", d);
        // Check if they are anagrams and print the result
        if (areAnagrams(c, d))
            printf("true\n");
        else
            printf("false\n");
        printf("%s\n", "~");

        // Free the allocated memory
        free(c);
        free(d);
    }

    return 0;
}

// } Driver Code Ends