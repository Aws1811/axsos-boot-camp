import Button from "@mui/material/Button";

const StatusButton = (props) => {
    const { label, currentStatus, onClick } = props;

    let isActive;
    if (label === currentStatus) {
        isActive = true;
    } else {
        isActive = false;
    }
    const getColor = () => {
        if (label === "Playing") return "success";
        if (label === "Not Playing") return "error";
        return "warning";
    };
    return (
        <Button
            variant={isActive ? "contained" : "outlined"}
            color={isActive ? getColor() : "inherit"}
            onClick={onClick}
        >
            {label}
        </Button>
    );
};

export default StatusButton;
