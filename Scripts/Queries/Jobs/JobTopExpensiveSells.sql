CREATE EVENT e_TopExpensiveSells
ON SCHEDULE EVERY 24 hour STARTS '2020-07-24 00:00:00'
DO call TopExpensiveSells()