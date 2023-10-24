'''
Function to convert a color in rgb format to hex format. 
r = red value (integer)
g = green value (integer)
b = blue value (integer)
Returns a string with the same color in hex format
'''
def rgb_to_hex(r, g, b):
    # Ensure values are greater than 0 and less than 255
    r = max(0, min(255, r))
    g = max(0, min(255, g))
    b = max(0, min(255, b))
    return '{:02X}{:02X}{:02X}'.format(r, g, b)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
