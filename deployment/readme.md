# 🚀 Django Deployment on AWS — Full Detailed Guide

---

## 💻 Part 1 — Local Machine Setup

### 1. Open Git Bash and activate your virtual environment:
```bash
source my_environments/djangoPy3Env/Scripts/activate
```

### 2. Navigate to your project folder:
```bash
cd ~/Desktop/axsos/python_stack/django/django_fullstack/semiRestful_TV_Shows-validated
```

### 3. Generate requirements.txt:
```bash
pip freeze > requirements.txt
```

### 4. Create .gitignore file:
```bash
cat > .gitignore << EOF
.vscode
__pycache__/
db.sqlite3
EOF
```
> ⚠️ Type this manually, don't paste it

> ℹ️ **Note:** If your virtual environment folder is outside your project folder, you don't need to add `env/` or `venv/` to `.gitignore`

### 5. Initialize Git and push to GitHub:
```bash
git init
git add .
git commit -m "first commit"
git remote add origin https://github.com/YourUsername/YourRepo.git
git branch -M main
git push -u origin main
```

---

## ☁️ Part 2 — Create EC2 Instance on AWS

### 1. Go to [aws.amazon.com](https://aws.amazon.com)
- Click **"Sign in to the Console"**
- Log in with your AWS account

### 2. Find EC2:
- In the search bar at the top type **"EC2"**
- Click on **EC2**
- Click **"Launch Instance"**

### 3. Configure the instance:
| Setting | Value |
|---|---|
| Name | `django-server` |
| OS | Ubuntu Server 24.04 LTS (Free tier eligible) |
| Instance type | `t3.micro` |

### 4. Create Key Pair:
- Scroll down to **"Key pair"** section
- Click **"Create new key pair"**
- Give it a name (e.g. `TV-key`)
- Leave everything as default (RSA, .pem)
- Click **"Create key pair"** — it will automatically download `TV-key.pem`
- ⚠️ **Save it somewhere safe — you can NEVER download it again!**

### 5. Network Settings — check these boxes:
- ✅ Allow SSH traffic (port 22)
- ✅ Allow HTTP traffic (port 80)

### 6. Storage and Advanced:
- Leave **Configure Storage** as default (8GB)
- Leave **Advanced Details** as default — no changes needed

### 7. Launch:
- Click **"Launch Instance"**
- Click **"View all instances"**
- Wait until status shows **"Running"** and **"3/3 checks passed"** ✅

---

## 🔗 Part 3 — Connect to the Server

### 1. Get the SSH command from AWS:
- Click on your instance in AWS Console
- Click the **"Connect"** button at the top
- Click the **"SSH client"** tab
- Copy the command at the bottom that looks like:
```
ssh -i "TV-key.pem" ubuntu@ec2-xx-xx-xx-xx.eu-north-1.compute.amazonaws.com
```

### 2. Open Git Bash on your local machine:
- Navigate to where your `.pem` file is saved:
```bash
cd /c/Users/YourUsername/Downloads
```
- Verify the file is there:
```bash
ls *.pem
```

### 3. Connect to the server:
```bash
ssh -i "TV-key.pem" ubuntu@ec2-xx-xx-xx-xx.eu-north-1.compute.amazonaws.com
```
- When asked **"Are you sure you want to continue connecting? (yes/no)"** type:
```bash
yes
```
- You should now see this in your terminal:
```
ubuntu@ip-172-xx-xx-xx:~$
```
✅ You are now inside your AWS server!

---

## 🛠️ Part 4 — Setup the Server

Run these commands one by one inside the server terminal:

### 1. Update the server:
```bash
sudo apt-get update
```

### 2. Install Nginx (web server):
```bash
sudo apt install nginx
```
- If asked **"Do you want to continue? [Y/n]"** type `y` and press Enter

### 3. Install Python pip:
```bash
sudo apt install python3-pip
```
- If asked **"Do you want to continue? [Y/n]"** type `y` and press Enter

### 4. Install Python venv:
```bash
sudo apt install python3.12-venv
```
- If asked **"Do you want to continue? [Y/n]"** type `y` and press Enter

---

## 📁 Part 5 — Setup the Project on Server

### 1. Clone your project from GitHub:
```bash
git clone https://github.com/YourUsername/YourRepo.git
```

### 2. Navigate into the project folder:
```bash
cd TV-project
```
- Verify your files are there:
```bash
ls
```

### 3. Create virtual environment:
```bash
python3 -m venv venv
```

### 4. Activate virtual environment:
```bash
source venv/bin/activate
```
- You should see `(venv)` at the start of your terminal ✅

### 5. Install project dependencies:
```bash
pip install -r requirements.txt
```

### 6. Run database migrations:
```bash
python manage.py migrate
```

---

## 🔧 Part 6 — Fix Settings

### 1. Open port 8000 on AWS:
- Go to **AWS Console** → **EC2** → **Instances**
- Click on your instance
- Click the **"Security"** tab
- Click your **Security Group** link
- Click **"Edit inbound rules"**
- Click **"Add rule"** and fill in:
  - Type: **Custom TCP**
  - Port: **8000**
  - Source: **Anywhere IPv4 (0.0.0.0/0)**
- Click **"Save rules"** ✅

### 2. Fix ALLOWED_HOSTS:
- On your **local machine** open your project in VS Code
- Navigate to `YourProjectName/settings.py`
- Find this line:
```python
ALLOWED_HOSTS = []
```
- Change it to:
```python
ALLOWED_HOSTS = ['your-ec2-public-ip']
```
- Save the file with **Ctrl+S**

### 3. Push the fix from your local machine Git Bash:
```bash
git add .
git commit -m "fix allowed hosts"
git push
```
- Enter your GitHub username when asked
- Enter your **Personal Access Token** as the password (not your GitHub password)

> ℹ️ **To create a Personal Access Token:**
> - Go to GitHub → Profile picture → Settings
> - Scroll to **Developer settings** → **Personal access tokens** → **Tokens (classic)**
> - Click **"Generate new token (classic)"**
> - Check the **"repo"** scope and click **"Generate token"**
> - Copy and save it immediately — you won't see it again!

### 4. Pull the fix on the server:
```bash
git pull
```

---

## ▶️ Part 7 — Run the App

### On the server run:
```bash
python manage.py runserver 0.0.0.0:8000
```

### Open your browser and go to:
```
http://your-ec2-public-ip:8000
```

🎉 **Your Django app is now live on AWS!**

---

## ⚠️ Common Issues & Fixes

| Problem | Fix |
|---|---|
| `DisallowedHost` error | Add your EC2 public IP to `ALLOWED_HOSTS` in `settings.py` |
| `TemplateDoesNotExist` | Check template filename — Linux is case sensitive! (`TVshows.html` ≠ `tvshows.html`) |
| Can't access the app in browser | Make sure port 8000 is open in AWS security group inbound rules |
| `externally-managed-environment` error | Create a virtual environment first with `python3 -m venv venv` |
| Git push asks for password | Use a GitHub Personal Access Token, not your regular password |
| `.pem` file not found | Navigate to the folder where you saved it using `cd` |

---

## 📝 Important Notes

- **Never** push your `.pem` file to GitHub
- **Never** put your `.pem` file inside your project folder
- **Never** share your Personal Access Token with anyone
- The `db.sqlite3` file is local only — the server uses its own database
- Always run `git pull` on the server after pushing fixes from your local machine

---

*Next step: Set up Gunicorn + Nginx for production deployment* 🚀