# LibrarySystem

A Java OOP project built to learn Git & GitHub through real development workflow.

---

## What This Project Is

A library management system where members can borrow and return books. The project was intentionally built step by step — each new feature was developed using a different Git concept, so the commit history itself reflects the learning journey.

```
src/library/
├── Book.java       — Book entity with availability tracking
├── Member.java     — Member entity with 3-book borrow limit
├── Library.java    — Core operations: search, borrow, return, overdue detection
├── Loan.java       — Loan tracking with 14-day period and fine calculation
└── Main.java       — End-to-end demo
```

---

## Git & GitHub Skills Practiced

**Version Control Basics**
- What VCS is and why it matters
- Git's three-layer architecture: Working Directory → Staging Area → Repository
- Difference between Git (local tool) and GitHub (remote platform)
- Repository setup with `git init`
- Identity configuration with `git config`
- SSH key generation and authentication with two separate GitHub accounts
- Ignoring build artifacts and IDE files with `.gitignore`

**Daily Workflow**
- Reading project state with `git status` and `git status -s`
- Browsing commit history with `git log`, `git log --oneline`, `git log --graph`
- Inspecting changes with `git diff` and `git diff --staged`
- Selectively staging hunks with `git add -p` to split one file into multiple commits
- Discarding changes with `git restore` and unstaging with `git restore --staged`
- Fixing the last commit with `git commit --amend`
- Writing meaningful commit messages following the Conventional Commits standard (`feat`, `fix`, `refactor`, `docs`, `chore`)

**Branching & Merging**
- How branches work as lightweight pointers
- Creating and switching branches with `git branch` and `git switch`
- Developing features in isolation on dedicated branches
- Fast-forward merge vs. 3-way merge and when each applies
- Resolving merge conflicts manually with a structured protocol
- Rebasing with `git rebase` to maintain a linear history
- Interactive rebase (`git rebase -i`) for squashing, rewording, and dropping commits
- Cleaning up merged branches with `git branch -d`

**Remote & Collaboration**
- Managing remotes with `git remote` (`origin`, `upstream`)
- Difference between `git fetch` and `git pull`
- Pushing branches and setting upstream with `git push -u`
- Safe force pushing with `--force-with-lease`
- Collaborator workflow vs. Fork & Pull Request workflow
- Branch strategy: `main / develop / feature / fix / hotfix / release`
- Opening Pull Requests, reviewing diffs line by line, and leaving comments
- Approving PRs and requesting changes during code review
- Enforcing PR requirements with Branch Protection Rules
- Documenting team workflow in `CONTRIBUTING.md`
- Tracking tasks with Issues, linking them to PRs with `Fixes #N`
- Using Issue templates and PR templates (`.github/`)
- Simulating a two-person team using two GitHub accounts

**Undoing Changes**
- `git restore` — discard uncommitted changes in working directory
- `git restore --staged` — unstage a file without losing changes
- `git reset --soft` — move HEAD back, keep changes in staging
- `git reset --mixed` — move HEAD back, keep changes in working directory
- `git reset --hard` — move HEAD back and discard everything
- `git reflog` — recover lost commits after a hard reset
- `git revert` — safely undo a pushed commit by adding a new one
- `git stash` — temporarily shelve unfinished work to switch context

**History Exploration**
- Visualizing branch history with `git log --graph` and custom aliases
- Searching commit history by keyword (`git log -S`, `git log --grep`)
- Finding which commit introduced a bug using `git bisect` (manual and automated with a test script)
- Tracing line-by-line authorship with `git blame`
- Inspecting a specific commit or file at a past state with `git show`

**GitHub Features**
- Issues and Milestones for release planning
- Pull Requests with squash merge, rebase merge, and merge commit options
- Branch Protection Rules (required reviews, no direct push to `main`)
- Issue templates and PR templates
- GitHub Actions for automated build on every push (CI/CD)
- Network graph for visualizing branch history
- Release tagging (`v1.0`)

---

## Commit Convention

```
feat(library): add loan tracking system
fix(member): handle null email on registration
refactor(book): extract availability logic
```

---

## Contributors

Developed using my own two GitHub accounts (enes-senbulbul and Solangerx) to simulate a real two-person team workflow.