this is a top-level externals workspace for the alive tools 

If you check out this workspace then the most recent versions of  all
of the alive integrated tools will be checked out from their
respective locations.

to change the projects edit the externals file and run 

 $ svn propset svn:externals -F externals . 

and then 

 $ svn commit

in the top-level directory 


To create an eclipse workspace from the projects; open eclipse, change
the workspace to this directory. 

File->Import->Existing Projects into workspace

select this directory as the base, and select all projects

