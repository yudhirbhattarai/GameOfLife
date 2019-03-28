# GameOfLife
The Game of Life, is a cellular automation simulation invented by the British mathematician
John Horton Conway in 1970. For more background information, see https://en.wikipedia.org/
wiki/Conway%27s_Game_of_Life
Goal
This program calculates the next generation of Conway’s game of
life, given an initial state.
Rules of the Game
The board (or playing field) for the Game of Life is a two dimensional grid of cells. Each cell is
considered to be either “alive” or “dead”. The next generation of the grid is calculated using
these rules:
1. Any live cell with fewer than two live neighbors dies, as if caused by under
population.
2. Any live cell with more than three live neighbors dies, as if by overcrowding.
3. Any live cell with two or three live neighbors lives on to the next generation.
4. Any dead cell with exactly three live neighbors becomes a live cell.
5. A cell’s neighbors are those cells which are horizontally, vertically or
diagonally adjacent. Most cells will have eight neighbors. Cells placed on the
edge of the grid will have fewer.
