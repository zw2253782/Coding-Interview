class Solution(object):
    def reverseVowels(self, s):
        if not s:
            return ''
        i = 0
        j = len(s)-1
        vowels = ['a','e','i','o','u','A','E','I','O','U']
        s = list(s)
        while i < j:
            if s[i] in vowels and s[j] in vowels:
                s[i], s[j] = s[j], s[i]
                i += 1
                j -= 1
            elif s[i] in vowels and not s[j] in vowels:
                j -= 1
            elif not s[i] in vowels and s[j] in vowels:
                i += 1
            else:
                i += 1
                j -= 1
        return ''.join(s)