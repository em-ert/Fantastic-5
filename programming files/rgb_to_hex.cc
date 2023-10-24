#include <iostream>
#include <sstream>
#include <iomanip>

std::string rgb_to_hex(int r, int g, int b) // takes in rgb values
{
    r = std::max(0, std::min(255, r)); // bounds rgb values from 0 to 255
    g = std::max(0, std::min(255, g));
    b = std::max(0, std::min(255, b));

    std::stringstream ss;
    ss << std::uppercase << std::hex << std::setfill('0') // converts rgb to hex
       << std::setw(2) << r << std::setw(2) << g << std::setw(2) << b;

    return ss.str(); // returns the hex value as a stringstream
}

//Test with std::string hexColor = rgb_to_hex(255, 127, 0); // returns "FF7F00"
