def KMPSearch(pat, txt):
    M = len(pat)
    N = len(txt)
    count  = 0
    # create lps[] that will hold the longest prefix suffix
    # values for pattern
    lps = [0]*M
    j = 0  # index for pat[]
 
    # Preprocess the pattern (calculate lps[] array)
    computeLPSArray(pat, M, lps)
 
    i = 0  # index for txt[]
    while (N - i) >= (M - j):
        count += 1
        if pat[j] == txt[i]: 
                     
            i += 1
            j += 1  
            
        if j == M:
            print("Found pattern at index " + str(i-j))
            j = lps[j-1]
 
        # mismatch after j matches
        elif i < N and pat[j] != txt[i]:            
            # Do not match lps[0..lps[j-1]] characters,
            # they will match anyway
            if j != 0:
                j = lps[j-1]
            else:
                i += 1
        
    print(count)
 
 
def computeLPSArray(pat, M, lps):
    len = 0  # length of the previous longest prefix suffix
 
    lps[0] = 0 # lps[0] is always 0
    i = 1
 
    # the loop calculates lps[i] for i = 1 to M-1
    while i < M:        
        if pat[i] == pat[len]:
            len += 1
            lps[i] = len
            print(lps)
            i += 1           
            
        else:
           
            if len != 0:
                len = lps[len-1]
                print(lps)
 
               
            else:
                lps[i] = 0
                print(lps)
                i += 1
                
 
 
txt = "WE CAN ONLY SEE A SHORT DISTANCE AHEAD, BUT WE CAN SEE PLENTY THERE THAT NEEDS TO BE DONE."
pat = "TRAINED"
KMPSearch(pat, txt)
 
