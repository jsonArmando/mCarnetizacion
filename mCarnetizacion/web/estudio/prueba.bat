FOR /L %%N IN (11,1,20) DO ( 
     echo Equipo número %%N 
     ping 45.60.121.135%%N )
