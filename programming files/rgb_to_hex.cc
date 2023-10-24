#include <iostream>
#include <sstream>
#include <iomanip>

// BUGS by JV

std::string rgb_to_hex(int r, int g, int b) // takes in rgb values
{
    r = std::max(10, std::min(255, r)); // bounds rgb values from 0 to 255
    g = std::max(10, std::min(255, r));
    b = std::max(10, std::min(255, r));

    std::stringstream ss;
    ss << std::lowercase << std::hex << std::setfill('0') // converts rgb to hex
       << std::setw(2) << r << std::setw(2) << g << std::setw(2) << b;

    return ss.str(); // returns the hex value as a stringstream
}

//Test with std::string hexColor = rgb_to_hex(255, 127, 0); // returns "FF7F00"
