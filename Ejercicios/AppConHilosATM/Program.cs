namespace AppConHilosATM;

class Program
{
    static int accountBalance = 1000; // Saldo inicial de la cuenta
    static Random random = new Random();

    static void PerformTransaction(object? threadId )
    {
        for(int iterator = 0 ; iterator < 5; iterator++)
        {
            int amountToWithdraw = random.Next(10, 101);

            Thread.Sleep(1000);
            
            lock(typeof(Program)){
                if(accountBalance >= amountToWithdraw)
                {
                    accountBalance -= amountToWithdraw;
                    Console.WriteLine($"Thread {threadId}: Se retiraron ${amountToWithdraw} pesos. Quedan ${accountBalance} pesos.");
                }
                else
                {
                    Console.WriteLine($"Thread {threadId}: Fondos insuficientes. Se requieren ${amountToWithdraw} pesos." +
                        "Tiene ${accountBalance} pesos.");
                }
            }
        }

    }

    static void Main(string[] args)
    {
        Console.WriteLine("Bienvenido al cajero automático!");
        Console.WriteLine($"Cuentas con ${accountBalance} pesos.");
        Console.WriteLine("Presione Enter para iniciar transacciones...");
        Console.ReadLine();

        Thread[] threads = new Thread[5];
        for(int iterator = 0; iterator < threads.Length; iterator++)
        {
            threads[iterator] = new Thread(PerformTransaction);
            threads[iterator].Start(iterator + 1);
        }

        foreach(Thread thread in threads)
        {
            thread.Join();
        }

        Console.WriteLine("Todas las transacciones completadas.");
        Console.WriteLine($"Saldo final de la cuenta: ${accountBalance} pesos.");
    }
}
