# list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# # iterate and print each value
# for i in range(0, len(list) + 1):
#     print(i)

# # slice
# print(list[4:-1])

class Players:

    def __init__(self):
        self.players = []
    
    def insert(self, value):
        self.players.append(value)

    def num_of_players(self):
        num = len(self.players)
        return num
        
    def search(self, target):
        for i in range(0, len(self.players)):
            if self.players[i] == target:
                return print('Item found at index: ', i)
            else:
                print('Item not found')


    def remove(self, target):
        player
        for player in range(0, len(self.players)):
            if self.players[i] == target:
                break
            print("Item not present")
        k = player
        for k in range(k, len(self.players)):
            self.players[k] = self.players[k+1]


class Manager:
    pl = Players()

    pl.insert(12)
    pl.insert(13)
    pl.insert(14)
    pl.insert(15)
    pl.insert(16)
    pl.insert(17)
    pl.insert(18)

    print(pl.num_of_players())

    pl.search(17)
    # pl.remove(15)

