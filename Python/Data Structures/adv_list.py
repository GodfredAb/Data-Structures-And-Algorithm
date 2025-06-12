class Players:

    def __init__(self):
        self.players = []
    
    def insert(self, value):
        self.players.append(value)

    def num_of_players(self):
        return len(self.players)
    
    def bubble_sort(self):
        for i in range(len(self.players) - 1):
            for j in range(len(self.players) - 1 - i):
                if self.players[j] > self.players[j+1]:
                    self.players[j], self.players[j+1] = self.players[j+1], self.players[j]
                         
    def search(self, target):
        for i in range(len(self.players)):
            if self.players[i] == target:
                print('Item found at index: ', i)
                return
        print('Item not found')


    def remove(self, target):
        if target in self.players:
            self.players.remove(target)
            print(f'Item {target} removed')
        else: 
            print('Item not present')
    
    def display(self):
        print(self.players)


class Manager:
    pl = Players()
    ml = Players()

    pl.insert(12)
    pl.insert(13)
    pl.insert(14)
    pl.insert(15)
    pl.insert(16)
    pl.insert(17)
    pl.insert(18)
    

    print(f'Number of players {pl.num_of_players()}')

    pl.display()
    pl.search(17)
    pl.remove(15)
    pl.display()


