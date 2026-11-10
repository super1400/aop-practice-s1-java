# Git Merge Practice

## 1. Fast-forward
Created a feature branch and merged it into main.
Git history remained a straight line without a merge commit.

## 2. Merge commit
Created feature2 and made independent commits in main and feature2.
Git created a merge commit with two parents.

## 3. Two parents
Verified the merge commit using:
git cat-file -p HEAD

The merge commit has two parent hashes.

## 4. No fast-forward
Used:
git merge --no-ff feature3 --no-edit

Git created a merge commit even though fast-forward was possible.

## 5. Fast-forward only
Used:
git merge --ff-only feature4

Git refused to merge because the branches had diverged.

## 6. Branch cleanup
Used:
git branch --merged
git branch -d feature feature2 feature3

Merged branches were deleted. feature4 remained because it was not merged.
